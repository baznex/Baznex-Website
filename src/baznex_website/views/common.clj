(ns baznex-website.views.common
  (:use [baznex-website.css :only (baznex-css)]
        noir.core
        hiccup.core
        hiccup.page-helpers))

(defmacro defpartial5 [fname params & body]
  `(defpartial ~fname ~params
     (html5
       ~@body)))

(defpartial5 baznex-layout [title & content]
  [:head
    [:title (str "B.A.Z.N.E.X. - " title)]
      (map include-css ["/css/reset.css"])
      [:style {:type "text/css"} (baznex-css)] ]
    [:body
    [:header]
    [:div#wrapper content]
    [:footer]])