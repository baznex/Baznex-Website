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

(defmacro definternallink [name relative-path text]
  `(def ~name [:a {:href ~relative-path} ~text]))

(definternallink manifesto-link "/manifesto" "BAZNEX Manifesto")


(defmacro defexternallink [name link text]
  `(def ~name [:a {:href ~link :target "_blank"} ~text] ))

(defexternallink google-group-link "http://groups.google.com/group/baznex" "BAZNEX @ Google Groups")

(defexternallink sprout-link "http://thesprouts.org/studios" "Sprout in Davis Square")

(defexternallink twitter-link "http://twitter.com/#!/search?q=%23baznex" "#baznex @ Twitter")

(defexternallink github-link "http://www.github.com/baznex" "BAZNEX @ GitHub")

(defexternallink trycljs-github-link "https://github.com/baznex/trycljs" "TryCljs &ndash; an online ClojureScript REPL, based off of TryClojure")

(defexternallink baznex-website-github-link "https://github.com/baznex/Baznex-Website" "BAZNEX Website &ndash; source available on GitHub")