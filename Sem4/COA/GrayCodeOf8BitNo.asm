;Lab 01
;Name : Bhabesh Behera
;Regd No : 2341002101  

;Gray code of a 8-bit number
;G = B XOR (B >> 1)
MOV AL, [5000H]   ; Load binary  
MOV BL, AL        ; Backup  
SHR AL, 1         ; Right shift  
XOR BL, AL        ; XOR for Gray code  
MOV [5001H], BL   ; Store result  
HLT               ; Halt
