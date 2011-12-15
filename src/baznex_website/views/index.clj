(ns baznex-website.views.index
  (:use [baznex-website.views.common]
        [noir.core :only [defpage]]
        hiccup.core
        hiccup.page-helpers))

(defpage "/" []
  (baznex-layout "Boston Autonomous Zone Nerd Nexus"
    [:h1 "What"]
    [:ul
      [:li manifesto-link]
      [:li google-group-link]]
    
    [:h1 "Where"]
    [:p "Currently gathering at " sprout-link] 
  
    [:h1 "When"] 
    [:p "Every other Wednesday at 6pm ending whenever you want to leave, but you can't sleep here."]
    [:p "Check the " google-group-link " for the next date."] ))