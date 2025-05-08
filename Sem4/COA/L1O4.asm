;Lab 01
;Name : Bhabesh Behera
;Regd No : 2341002101  

;2s complement of a 8-bit number
MOV AL, [5000H]    ; Load AL
NOT AL              ; 1's complement
ADD AL, 01          ; 2's complement
MOV [5001H], AL     ; Store result
HLT                 ; Halt
