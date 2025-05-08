;Lab : 02
;Name : Bhabesh Behera
;Regd no. : 2341002101

;Sum & Average of N 16 bit number
MOV AX, 0000H       ; Clear AX (sum accumulator)
MOV SI, 5002H       ; Point to first number
MOV CX, [5000H]     ; Load N (number of numbers)

L1: 
    ADD AX, [SI]    ; Add current number to sum
    ADD SI, 02      ; Move to next number
    DEC CX          ; Decrease N
    JNZ L1          ; Loop until N is 0

MOV [5010H], AX     ; Store sum at [5010H]

MOV BX, AX          ; Move sum to BX for division
MOV DX, 0000H       ; Clear DX
MOV AX, BX          ; Load sum into AX for division
MOV CX, [5000H]     ; Load N into CX
DIV CX              ; Divide sum by N

MOV [5012H], AX     ; Store average at [5012H]
HLT                 ; Halt
