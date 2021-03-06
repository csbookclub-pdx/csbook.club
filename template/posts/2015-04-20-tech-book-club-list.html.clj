; @layout post
; @title  Tech Book Club List (Spring 2015)
; @tag    books

(defn been-read [book]
 [:span {:style "text-decoration: line-through"} book])

(defn book [title author url]
  (list (link title url) ", by " author))

(p "Initial list of CS books to read. Books that are struck through have already been read.")

(ul (list (book "Structure and Interpretation of Computer Programs"
                "Harold Abelson and Gerald Jay Sussman with Julie Sussman"
                "http://mitpress.mit.edu/sicp/")
          (book "The Art of UNIX Programming"
                "Eric S. Raymond"
                "http://www.catb.org/~esr/writings/taoup/")
          (book "Gödel, Escher, Bach: An Eternal Golden Braid"
                "Douglas R. Hofstadter"
                "http://www.amazon.com/dp/0465026567")
          (book "Working Effectively with Legacy Code"
                "Michael Feathers"
                "http://www.amazon.com/dp/0131177052")
          (book "The Pragmatic Programmer: From Journeyman to Master"
                "Andrew Hunt and David Thomas"
                "http://pragprog.com/book/tpp/the-pragmatic-programmer")
          (been-read (book "Clean Code: A Handbook of Agile Software Craftsmanship"
                "Robert C. Martin"
                "http://www.amazon.com/dp/0132350882"))
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
          (been-read (book "Various Academic CS Papers"
                "Various Authors"
                "https://github.com/papers-we-love/papers-we-love"))
          (book "Design Patterns: Elements of Reusable Object-Oriented Software"
                "Gang of Four"
                "http://c2.com/cgi/wiki?DesignPatternsBook")
))
