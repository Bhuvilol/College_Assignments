;Lab 02
;Name : Bhabesh Behera
;Regd no. : 2341002101

;Move data from one location to another
MOV SI, 3000H    ; Set source address
MOV DI, 5000H    ; Set destination address
MOV CL, 05H      ; Set loop count = 5

L1:
MOV BX, [SI]     ; Load word from source
MOV [DI], BX     ; Store word to destination
INC SI           ; Next byte
INC SI           ; (total +2 to point to next word)
INC DI           ; Next byte
INC DI           ; (total +2 to point to next word)
DEC CL           ; Decrease counter
JNZ L1           ; Repeat if not zero

HLT              ; Stop execution
