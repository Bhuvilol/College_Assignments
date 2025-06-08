;Lab 02
;Name : Bhabesh Behera
;Regd no. : 2341002101

;Count no. of 0's in an 8 bit number
MOV SI, 5000H       ; Point to input
MOV AL, [SI]        ; Load byte
MOV CL, 08H         ; Set bit count
MOV CH, 00H         ; Zero-bit counter

L2: SHR AL, 1       ; Shift right
    JC L1           ; If 1, skip
    INC CH          ; Count 0
L1: DEC CL          ; Loop 8 times
    JNZ L2

INC SI              ; Next memory
MOV [SI], CH        ; Store 0 count
HLT
