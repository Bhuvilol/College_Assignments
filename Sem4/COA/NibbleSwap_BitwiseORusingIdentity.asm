;Lab 02
;Name : Bhabesh Behera
;Regd no : 2341002101

;Nibble Swap 
MOV AL, [5000H]    ; Load byte from 5000H
MOV BL, AL         ; Copy to BL
SHR AL, 4          ; Move high nibble to low
SHL BL, 4          ; Move low nibble to high
OR AL, BL          ; Combine swapped nibbles
MOV [5001H], AL    ; Store result at 5001H

;Bitwise OR using identity
MOV AL, 00H        ; Clear AL
MOV BL, 00H        ; Clear BL
MOV AL, [5010H]    ; Load from 5010H
MOV BL, [5011H]    ; Load from 5011H
MOV CL, AL         ; Copy AL to CL
AND AL, BL         ; AL = AL AND BL
XOR CL, BL         ; CL = AL XOR BL
OR AL, CL          ; AL = AL OR BL
MOV [5015H], AL    ; Store result at 5015H

HLT                ; End program
        