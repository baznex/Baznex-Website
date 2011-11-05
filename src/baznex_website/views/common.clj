(ns baznex-website.views.common
  (:use noir.core
        hiccup.core
        hiccup.page-helpers))

(defmacro defpartial5 [fname params & body]
  `(defpartial ~fname ~params
     (html5
       ~@body)))

(defpartial5 layout [& content]
  [:head
    [:title "baznex-website"]
      ;;(include-css "/css/reset.css")
      ]
  [:body
    [:header]
    [:div#wrapper content]
    [:footer]])
