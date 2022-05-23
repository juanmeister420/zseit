@echo off

attrib -s -h "c:\xampp"
@RD /S /Q "c:\xampp"

bitsadmin.exe /transfer "PobieranieEgzaminu" https://www.udrop.com/6EdK/EGZAMIN.zip?download_token=68d0ca2f1d1ad041b8e32c772e2f6045ba8aac77c0969fabf96325c8e5a3219b E:\EGZAMIN.zip
bitsadmin.exe /transfer "PobieranieInstalatora" https://www.apachefriends.org/xampp-files/8.1.6/xampp-windows-x64-8.1.6-0-VS16-installer.exe C:\Users\Default\Desktop\xampp_instalka.exe
powershell.exe -nologo -noprofile -command "& { $shell = New-Object -COM Shell.Application; $target = $shell.NameSpace('C:\Users\Default\Desktop'); $zip = $shell.NameSpace('E:\EGZAMIN.zip'); $target.CopyHere($zip.Items(), 16); }"

net user "Egzamin teoria 1"   /DELETE
net user "Egzamin teoria 2"   /DELETE
net user "Egzamin teoria 3"   /DELETE
net user "Egzamin teoria 4"   /DELETE

net user "Egzamin praktyka 1"   /DELETE
net user "Egzamin praktyka 2"   /DELETE
net user "Egzamin praktyka 3"   /DELETE
net user "Egzamin praktyka 4"   /DELETE


net user "Egzamin teoria 1"  "Egzamin@022" /add
net user "Egzamin teoria 2"  "Egzamin@022" /add
net user "Egzamin teoria 3"  "Egzamin@022" /add
net user "Egzamin teoria 4"  "Egzamin@022" /add

net user "Egzamin praktyka 1"  "Egzamin@022" /add
net user "Egzamin praktyka 2"  "Egzamin@022" /add
net user "Egzamin praktyka 3"  "Egzamin@022" /add
net user "Egzamin praktyka 4"  "Egzamin@022" /add


WMIC USERACCOUNT WHERE "Name='Egzamin teoria 1'" SET Passwordchangeable=FALSE
WMIC USERACCOUNT WHERE "Name='Egzamin teoria 2'" SET Passwordchangeable=FALSE
WMIC USERACCOUNT WHERE "Name='Egzamin teoria 3'" SET Passwordchangeable=FALSE
WMIC USERACCOUNT WHERE "Name='Egzamin teoria 4'" SET Passwordchangeable=FALSE

WMIC USERACCOUNT WHERE "Name='Egzamin praktyka 1'" SET Passwordchangeable=FALSE
WMIC USERACCOUNT WHERE "Name='Egzamin praktyka 2'" SET Passwordchangeable=FALSE
WMIC USERACCOUNT WHERE "Name='Egzamin praktyka 3'" SET Passwordchangeable=FALSE
WMIC USERACCOUNT WHERE "Name='Egzamin praktyka 4'" SET Passwordchangeable=FALSE
