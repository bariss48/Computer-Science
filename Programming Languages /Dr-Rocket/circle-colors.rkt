;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname circle-colors) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(require 2htdp/image)

(above (circle 40 "solid" "red")
       (circle 40 "solid" "yellow")
       (circle 40 "solid" "green")
                                  )

(define (bulb c)
  (circle 40 "solid" c))

(bulb "purple")


(above (bulb "orange")
       (bulb "black")
       (bulb "blue")
                     )
