(ns baznex-website.views.common
  (:use [baznex-website.css :only (baznex-css)]
        noir.core
        hiccup.core
        hiccup.page-helpers))

(defn internal-link 
  "A link within the site"
  [relative-path text]
  [:a {:href relative-path} text])

(def home-link (internal-link "/" "&larr; Home"))

(def manifesto-link (internal-link "/manifesto" "The Manifesto"))

(def name-link (internal-link "/name" "Why the name BAZNEX?"))

(defn external-link 
  "A link external to the site"
  [link text]
  [:a {:href link :target "_blank"} text] )

(def google-group-link (external-link "http://groups.google.com/group/baznex" "BAZNEX @ Google Groups"))

(def sprout-link (external-link "http://thesprouts.org/studios" "Sprout in Davis Square"))


(def twitter-link (external-link "http://twitter.com/#!/search?q=%23baznex" "#baznex @ Twitter"))

(def github-link (external-link "http://www.github.com/baznex" "BAZNEX @ GitHub"))

(def trycljs-github-link (external-link "https://github.com/baznex/trycljs" "TryCljs &ndash; an online ClojureScript REPL, based off of TryClojure"))

(def baznex-website-github-link (external-link "https://github.com/baznex/Baznex-Website" "BAZNEX Website &ndash; source available on GitHub"))

(def autonoumous-zone-wiki-link (external-link "https://github.com/baznex/Baznex-Website" "Temporary Autonomous Zone - Wikipedia"))

(def autonoumous-zone-link (external-link "http://www.sacred-texts.com/eso/taz.htm" "Temporary Autonomous Zone"))



(defpartial baznex-layout [title & content]
  (html5
    [:head
      [:title (str "B.A.Z.N.E.X. - " title)]
      (include-css "/css/reset.css")
      [:style {:type "text/css"} (baznex-css)] ]
    [:body
      [:div#wrapper content]
      [:footer home-link]] ))