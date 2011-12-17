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

(def google-group-link [:a {:href "http://groups.google.com/group/baznex" :target "_blank"} "BAZNEX Google Group"])

(def sprout-link [:a {:href "http://thesprouts.org/studios" :target "_blank"} "Sprout in Davis Square"])

(def manifesto-link [:a {:href "/manifesto"} "BAZNEX Manifesto"])

(def github-link [:a {:href "http://www.github.com/baznex" :target "_blank"} "BAZNEX @ GitHub"])

(def trycljs-github-link [:a {:href "https://github.com/baznex/trycljs" :target "_blank"} "TryCljs &ndash; an online ClojureScript REPL, based off of TryClojure"])

(def baznex-website-github-link [:a {:href "https://github.com/baznex/Baznex-Website" :target "_blank"} "BAZNEX Website &ndash; source available on GitHub"])