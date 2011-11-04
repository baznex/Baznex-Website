(ns baznex-website.views.welcome
  (:use [baznex-website.views.common :only (layout)]
        [noir.core :only [defpage]]
        hiccup.core
        hiccup.page-helpers))

(defpage "/" []
  (layout
    [:h1 "B.A.Z.N.E.X."]
    [:h2 "Boston Autonomous Zone Nerd Nexus"]))
