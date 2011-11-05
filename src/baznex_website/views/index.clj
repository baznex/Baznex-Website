(ns baznex-website.views.index
  (:use [baznex-website.views.common :only (layout)]
        [noir.core :only [defpage]]
        hiccup.core
        hiccup.page-helpers))

(defpage "/" []
  (layout
    [:h1 "Boston Autonomous Zone Nerd Nexus"]
    [:h2 "What's New?"]
    [:ul
      [:li [:a {:href "/manifesto"} "BAZNEX Manifesto"]]
      [:li [:a {:href "http://groups.google.com/group/baznex" :target "_blank"} "Baznex Google Group"]]]))