; @layout post
; @title  Tech Book Club List (Fall 2015)
; @tag    books

(defn book [title author url]
  (list (link title url) ", by " author))

(p "What should we read next? Here are some ideas.")

(ul (list (book "Structure and Interpretation of Computer Programs"
                "Harold Abelson and Gerald Jay Sussman with Julie Sussman"
                "http://mitpress.mit.edu/sicp/")
          (book "The Art of UNIX Programming"
                "Eric S. Raymond"
                "http://www.catb.org/~esr/writings/taoup/")
          (book "Gödel, Escher, Bach: An Eternal Golden Braid"
                "Douglas R. Hofstadter"
                "http://www.amazon.com/dp/0465026567")
          (book "The Pragmatic Programmer: From Journeyman to Master"
                "Andrew Hunt and David Thomas"
                "http://pragprog.com/book/tpp/the-pragmatic-programmer")
          (book "The Cathedral and the Bazaar"
                "Eric S. Raymond"
                "http://www.catb.org/~esr/writings/cathedral-bazaar/")
          (book "The Mythical Man-Month: Essays on Software Engineering"
                "Frederick P. Brooks Jr."
                "http://www.amazon.com/dp/0201835959")
          (book "Beautiful Code: Leading Programmers Explain How They Think"
                "Andy Oram (Editor) and Greg Wilson (Editor)"
                "http://www.amazon.com/dp/0596510047")
          (book "Real World Haskell"
                "Bryan O'Sullivan, John Goerzen, and Don Stewart"
                "http://www.amazon.com/dp/0596514980/")
          (book "Various Academic CS Papers"
                "Various Authors"
                "https://github.com/papers-we-love/papers-we-love")
          (book "Design Patterns: Elements of Reusable Object-Oriented Software"
                "Gang of Four"
                "http://c2.com/cgi/wiki?DesignPatternsBook")
          (book "The Architecture of Open Source Applications"
                "Various Authors"
                "http://www.aosabook.org/en/index.html")
          (book "Coders At Work"
                "Peter Seibel"
                "http://codersatwork.com/")
          (book "The Art of Computer Programming"
                "Donald Knuth"
                "http://www-cs-faculty.stanford.edu/~uno/taocp.html")
          (book "Introduction to Algorithms"
                "Cormen, Leiserson, Rivest, and Stein"
                "https://mitpress.mit.edu/books/introduction-algorithms")
))


(defn been-read [book]
 [:span {:style "text-decoration: line-through"} book])
(defn finished-book [title author url]
  (been-read (book title author url)))

(p "Previously we've read:")

(ul (list (finished-book "Clean Code: A Handbook of Agile Software Craftsmanship"
                         "Robert C. Martin"
                         "http://www.amazon.com/dp/0132350882")
          (finished-book "Actor Model of Computation: Scalable Robust Information Systems"
                         "Carl Hewitt."
                         "http://arxiv.org/abs/1008.1459")
          (finished-book "Why Functional Programming Matters"
                         "John Hughes"
                         "https://github.com/papers-we-love/papers-we-love/blob/master/functional_programming/why-functional-programming-matters.pdf")
          (finished-book "Time, Clocks, and the Ordering of Events in a Distributed System"
                         "Leslie Lamport"
                         "http://research.microsoft.com/en-us/um/people/lamport/pubs/time-clocks.pdf")
          (finished-book "Working Effectively with Legacy Code"
                         "Michael Feathers"
                         "http://www.amazon.com/dp/0131177052")
          (finished-book "Game Theory"
                         "John Nash"
                         "https://mathoverflow.net/questions/162836/why-was-john-nashs-1950-game-theory-paper-such-a-big-deal")
))
