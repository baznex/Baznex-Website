(ns baznex-website.css
  (:use cssgen
        cssgen.types))

(def fldi (mixin :float :left
                 :display :inline))

(def dark-text (mixin :color :black))
(def emphasis (mixin :font-style :italic))
(def box (mixin :border-radius :8px
           :padding :10px))

(defn baznex-css []
  (css
    (rule "body"
          :padding [:60px :80px]
          :font-family "'Helvetica Neue',Helvetica,Verdana")
    (rule "#wrapper"
          fldi
          :padding-bottom :100px)
    (rule "h1"
          :font-weight :bold
          :margin-top :15px
          :margin-bottom :0px
          :font-size :35px)
    (rule "h2"
          :font-weight :bold
          :margin-top :15px
          :margin-bottom :0px
          :font-size :24px)
    (rule "h3"
          emphasis
          :font-weight :bold
          :margin-top :10px
          :margin-left :20px
          :font-size :18px
          :font-weight :normal)
    (rule "ul"         
          :margin :10px :10px :15px :10px
          (rule "li"
                :margin-left :15px
                :width "100%" ))
    (rule "p"
          :margin (em 1.12) (em 0))

    (rule "a"
          (rule "&:hover"
                emphasis))

    (rule "#not-found"
          :text-align :center
          :width :600px
          :margin [:0px :auto]
          :margin-top :200px
          (rule "h1"
                emphasis
                :font-size :32px
                :margin-bottom :20px
                ))

    (rule "#exception"
          :max-width :900px
          :min-width :500px
          (rule "h1"   
                :font-weight :bold
                :font-size :24px)
          (rule "ul"
                :margin 0
                :padding 0
                :margin-top :20px
                :list-style :none)
          (rule "table"
                :width "100%"
                :margin-top :20px
                :border-collapse :collapse)
          (rule "tr"
                :margin-bottom :10px
                :width "100%")
          (rule "td"
                :padding :10px)

          (rule ".dt"
                :text-align :right)
          (rule ".dd"
                :margin 0
                :padding-left "5%")
          (rule "h1 span"
                :font-weight :bold
                :font-size :18px
                :font-weight :normal))))