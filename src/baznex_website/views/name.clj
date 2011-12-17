(ns baznex-website.views.name
  (:use [baznex-website.views.common]
        [noir.core :only [defpage]]
        hiccup.core
        hiccup.page-helpers))

(defpage "/name" []
  (baznex-layout "Why BAZNEX?"
    [:h1 "What's the Name All About?"] 
    [:h3 "It is an accurate yet intentionally goofy name, because we are serious about having a good time."] 

    [:h2 "Boston"]
    [:p "We're based out of Boston."]

    [:h2 "Autonomous Zone"]
    [:blockquote "In the formation of a Temporary Autonomous Zone, Bey argues, information becomes a key tool that sneaks into the cracks of formal procedures. A new territory of the moment is created that is on the boundary line of established regions. Any attempt at permanence that goes beyond the moment deteriorates to a structured system that inevitably stifles individual creativity. It is this chance at creativity that is real empowerment."]
  
    [:ul 
     [:li autonoumous-zone-link] 
     [:li autonoumous-zone-wiki-link] ]

    [:h2 "Nerd"]
    [:p "One whose IQ exceeds his weight."]
  
    [:h2 "Nexus"]
    [:p "As we all connect together we generate good vibes, and new exciting ideas are born."]
    
    [:h2 "Honorable Mention"]
    [:p "It begins with 'Baz' the third most important computer science word behind 'Foo' and 'Bar'."]))
