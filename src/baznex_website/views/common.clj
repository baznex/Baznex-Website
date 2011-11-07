(ns baznex-website.views.common
  (:use [baznex-website.css :only (baznex-css)]
        noir.core
        hiccup.core
        hiccup.page-helpers))

(defpartial baznex-layout [title & content]
  (html5
    [:head
      [:title (str "B.A.Z.N.E.X. - " title)]
      (include-css "/css/reset.css")
      [:style {:type "text/css"} (baznex-css)] ]
    [:body
      [:div#wrapper content]
      [:footer]] ))