(ns baznex-website.views.manifesto
  (:use [baznex-website.views.common]
        [noir.core :only [defpage]]
        hiccup.core
        hiccup.page-helpers))

(defpage "/manifesto" []
  (baznex-layout "The Manifesto"
    [:h1 "B.A.Z.N.E.X."]
    [:h3 "Boston Autonomous Zone Nerd Nexus"]
  
    [:p "The short version is that we’re a self-directed organization focused on the joys of software development, community, and learning."]
    [:p "Before we get into more details about what we are let’s start with what BAZNEX is NOT: "]
    [:ul
      [:li "BAZNEX is not a meetup, but we do meet together."]
      [:li "BAZNEX is not a forum, but we do discuss."]
      [:li "BAZNEX is not a lesson, because there is no one teacher."]
      [:li "BAZNEX is not corporate sponsored, because we don’t have ulterior motives of hiring you.  We’re here to better ourselves and, ultimately, the world.  But who knows who you might meet, and what connections might be born."]
      [:li "BAZNEX is not an open source programming club, but we might work on some open source projects."]
      [:li "BAZNEX is not a place to teach or be taught, but it is a place to grow together with others, and to teach when called upon to do so."]
      [:li "BAZNEX has NO agenda. There are no lectures and no prearranged topics. You come, you meet others, and you join the party. That good vibe you feel here is what we call the Nerd Nexus."]
      [:li "BAZNEX has no leader, but for the force of willpower generated through a phenomenon called a Nerd Nexus - that moment with the vibes so delicious, and the love of computer science and software development, as well as the inspired action for the community, and for the history of computing."] ]
  
    [:h2 "Okay, BAZNEX isn’t any of those things. So what IS it??: "]
    [:ul
      [:li "BAZNEX is appreciating and revering the history of our profession."]
      [:li "BAZNEX is sharing cool software stuff."]
      [:li "BAZNEX is experiencing the greater nerd community of Boston."]
      [:li "BAZNEX is pairing together with others to share expertise, and to contribute back to the Open Source community, and the community at large."]
      [:li "BAZNEX is about the community of software developers."]
      [:li "BAZNEX is about appreciating the venerable greats of our industry and mooching off of their awesomeness by osmosis."]
      [:li "BAZNEX is about bringing up novices."]
      [:li "Yes. BAZNEX is a software osmosis, free-form, group software block-party."]
      [:li "On any given BAZNEX meeting (we call them nexuses) pretty much anything could happen."]
      [:li "But you can generally count on working on some code, and learning cool stuff from those you pair up with at the nexus.  You are encouraged to write on the wiki what your interests are; that way others who are interested in learning with you can say hello and you may pair together, and vice versa!"]
      [:li "BAZNEX grows organically; your presence makes you a part of it all, and so your desires matter."] ]
  
    [:h2 "What you can do if you're interested in joining the Nexus"]
  
    [:h3 "NOTE: The following paragraphs are kept intact here mostly unchanged for historical reasons. Currently, as of Dec, 10, 2011, we get together about every other week at " sprout-link ". You can keep informed of current goings on by tuning in to our " google-group-link "."]
  
    [:p "We're very much in a primordial state. We have had one small (successful!) gathering of three at the Andala coffee shop in Central Square Cambridge where we discussed why I love index cards, a bit about teaching others programming, took a look at the SeeSaw Clojure Swing-wrapping library, and took time to work on adding a feature to Midje, a Clojure testing/mocking framework."]
  
    [:p "The current process we've done (a total of one time) is to have everyone write down on index cards  the different activities they might want to do at that gathering.  Then put them all together and we split up into pairs or triples. Last gathering index cards were written such as \"want to look at SeeSaw?\", \"talk more about teaching programming\", \"fix the code Alex broke in Midje\", \"do some remote pairing, or at least learn more about how we could\", \"create a Content Management system in Clojure\", \"can anyone help me with my 5 minute lightning talk on Clojure I'm doing tomorrow?\""]
  
    [:p "We're looking into finding larger venues preferably closer to downtown Boston for easier access by all of us, and places that can fit more of us than just a coffee shop can handle. " sprout-link " is going to be our next location to try out on Wednesday Nov 1. [Note Dec. 7, 2011: have tried and enjoyed Sprout.  Will gather there again in the future for sure.]"]
  
    [:p "Also, if this all is jiving with you, we've got a " google-group-link " we've just started, where all future discussion of BAZNEX will transpire."]
  
    [:p "Please tell anyone you think may be interested. The more the merrier.  Any suggestions, offerings, additions, or displays of exuberance, also invited."] ))