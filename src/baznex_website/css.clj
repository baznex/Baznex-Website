(ns baznex-website.css
  (:use cssgen
        cssgen.types))

(def fldi (mixin :float :left
                 :display :inline))

(def dark-background (mixin :background :#81ECB8
                            :color :#106B3E))

(def light-text (mixin :color :#d1d9e1))
(def dark-text (mixin :color :#6B2710))
(def emphasis (mixin :color :#41261D))
(def de-emph (mixin :color :#9D4020))
(def box (mixin :border-radius :8px
                :padding :10px))
(def light-box (mixin box
                      :background :#CDDBC6
                      :border [:2px :solid :#616363]))
(def emph-box (mixin box
                     :background :#6EA954
                     :border [:2px :solid :#8BA77F]))


(defn baznex-css []
  (css
    (rule "body"
          dark-background
          :padding [:60px :80px]
          :font-family "'Helvetica Neue',Helvetica,Verdana")
    (rule "#wrapper"
          fldi
          :padding-bottom :100px)
    (rule "h1"
          :margin-top :15px
          :margin-bottom :0px
          :font-size :25px
          dark-text)
    (rule "h2"
          dark-text
          :margin-top :10px
          :margin-left :20px
          :font-size :18px
          :font-weight :normal)
    (rule "code"
          fldi
          light-box
          :font-family "Monaco, Consolas, 'Courier New'")
    (rule "ul"
          light-box
          :margin :10px :10px :15px :10px
          (rule "li"
                :margin-left :15px
                :width "100%" ))
    (rule "p"
          :margin (em 1.12) (em 0))

    (rule "a"
          dark-text
          (rule "&:hover"
                emphasis)
          (rule "&:visited"
                de-emph))

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
                light-box
                :margin-bottom :10px
                :width "100%")
          (rule "td"
                :padding :10px)

          (rule ".dt"
                :text-align :right)
          (rule ".dd"
                de-emph
                :margin 0
                :padding-left "5%")
          (rule "h1 span"
                :font-size :18px
                :font-weight :normal
                de-emph)
          (rule ".mine"
                emph-box))))