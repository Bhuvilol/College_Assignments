;Lab : 02
;Name : Bhabesh Behera
;Regd no. : 2341002101

;Multiplication without using MUL
MOV BX, [5000H]   ; BX = multiplicand  
MOV CX, [5002H]   ; CX = multiplier  
MOV DX, 0         ; Clear upper result  
MOV AX, 0         ; Clear lower result  

L2: ADD AX, BX    ; Add BX to AX  
JNC L1            ; Skip if no carry  
INC DX            ; Add carry to DX  

L1: DEC CX        ; Decrease count  
JNZ L2            ; Repeat if CX ? 0  

MOV [5010H], AX   ; Save lower result  
MOV [5012H], DX   ; Save upper result  
HLT               ; Stop  
