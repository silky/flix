(def-type Sign (variant ((Top) (Neg) (Zer) (Pos) (Bot))))

(def-type A Sign)
(def-type B Sign)
(def-type R Sign)

(def-bot Sign Bot)

(def-leq Sign (e1 Sign e2 Sign)
    (match <e1 e2>
        (case <Bot x>       true)
        (case <Neg Neg>     true)
        (case <Zer Zer>     true)
        (case <Pos Pos>     true)
        (case <_   Top>     true)
        (case _             false)))

(def-lub Sign (e1 Sign e2 Sign)
    (match <e1 e2>
        (case <Bot x>       x)
        (case <x   Bot>     x)
        (case <Neg Neg>     Neg)
        (case <Zer Zer>     Zer)
        (case <Pos Pos>     Pos)
        (case _             Top)))

(def-height Sign (e Sign)
    (match e
        (case Bot   3)
        (case Neg   2)
        (case Zer   2)
        (case Pos   2)
        (case Top   1)))

(def-fun sum (e1 Sign e2 Sign)
    (match <e1 e2>
        (case <Bot _>       Bot)
        (case <_   Bot>     Bot)
        (case <Neg Neg>     Neg)
        (case <Neg Zer>     Neg)
        (case <Neg Pos>     Top)
        (case <Zer Neg>     Neg)
        (case <Zer Zer>     Zer)
        (case <Zer Pos>     Pos)
        (case _             Top)))

(fact (A Zer))
(fact (B Pos))

(rule (R (sum x y)) ((A x) (B y)))