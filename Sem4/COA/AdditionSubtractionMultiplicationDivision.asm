; Lab : 01
; Name : Bhabesh Behera    
; Regd No. : 2341002101

;Addition
MOV AX, 4225H       ; Load first number
MOV CX, AX          ; Save copy in CX
ADD AX, 4324H       ; Add second number
MOV [5000H], AX     ; Store result

;Subtraction 
MOV AX, CX          ; Restore original number
SUB AX, 4324H       ; Subtract second number
MOV [5010H], AX     ; Store result

;Multiplication
MOV AX, CX          ; Load original number
MOV BX, 4324H       ; Load second number
MUL BX              ; Multiply AX * BX ? DX:AX
MOV [5020H], AX     ; Store lower 16 bits
MOV [5022H], DX     ; Store upper 16 bits

;Division 
MOV AX, CX          ; Load original number
MOV BX, 4324H       ; Load divisor
MOV DX, 0000H       ; Clear DX
DIV BX              ; Divide DX:AX by BX
MOV [5030H], AX     ; Store quotient
MOV [5032H], DX     ; Store remainder

HLT                 ; End program
