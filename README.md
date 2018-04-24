# brackets-verifier
Create simple application/method, which will receive character string consist only of following characters: `[, ], (, ), 0-9` (square brackets, round brackets, digits from 0 to 9).

Your application/method should return `TRUE` or `FALSE` string in console after checking if brackets are properly opened and closed. For example:


* `(([34[34]])234)` - `TRUE`
* `([6)` - `FALSE`
* `([([()])])` - `TRUE`
* `([3)]` - `FALSE`
* `(]` – `FALSE`
 

Prepare your application for very large entry data string (even couple millions of characters).
