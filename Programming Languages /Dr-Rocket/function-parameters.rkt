;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-beginner-reader.ss" "lang")((modname function-parameters) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #f #t none #f () #f)))
(require 2htdp/image)

(define (bulb c)
  (square 30 "solid" c) )

(bulb (string-append "re" "d"))
(bulb "purple")
(square 50 "solid" "blue")
(define width 100)
(define height 100)

(> width height)
(>= width height)
(= 1 2)
(< 3 4)
(string=? "baris" "baris")
(define r1 (rectangle 10 20 "solid" "red"))
(define r2 (rectangle 20 10 "solid" "red"))

(< (image-width r1)
   (image-width r2) )

(= (image-width r1)
   (image-width r2) )