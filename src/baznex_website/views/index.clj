(ns baznex-website.views.index
  (:use [baznex-website.views.common :only (baznex-layout)]
        [noir.core :only [defpage]]
        hiccup.core
        hiccup.page-helpers))

(let [google-group-link [:a {:href "http://groups.google.com/group/baznex" :target "_blank"} "BAZNEX Google Group"]
      sprout-link [:a {:href "http://thesprouts.org/studios" :target "_blank"} "Sprout in Davis Square"]]

  (defpage "/" []
    (baznex-layout "Boston Autonomous Zone Nerd Nexus"
      [:h1 "What"]
      [:ul
        [:li [:a {:href "/manifesto"} "BAZNEX Manifesto"]]
        [:li [:a {:href "http://groups.google.com/group/baznex" :target "_blank"} "Baznex Google Group"]]]
      
      [:h1 "Where"]
      [:p "Currently gathering at " sprout-link] 
    
      [:h1 "When"] 
      [:p "Every other Wednesday at 6pm ending whenever you want to leave, but you can't sleep here."]
      [:p "Check the " google-group-link " for the next date."] )))