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
      [:li google-group-link]
      [:li github-link]]
    
    [:h1 "Where"]
    [:p "Currently gathering at " sprout-link] 
  
    [:h1 "When"] 
    [:p "Every other Wednesday at 6pm ending whenever you want to leave, but you can't sleep here."]
    [:p "Check the " google-group-link " for the next date."] 
    
    [:h1 "You"]
    [:p "Is there something you're passionate about sharing, doing, or learning about?"] 
    [:p "That's what B.A.Z.N.E.X. is all about."] 
    
    [:h1 "Notable BAZNEX Projects"]
    [:ul
      [:li baznex-website-github-link]
      [:li trycljs-github-link]] ))