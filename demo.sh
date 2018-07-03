#!/bin/bash

read -p 'Folder name Input:' folder





 mkdir  $folder

for i in 1 2 3 4
do
  touch $folder/$folder$i.txt
done

for dir in $folder/*; do
        echo $dir;
        done


zip -r $folder/$folder.zip   $folder


input="$folder"
reverse=""

len=${#input}
for((i=len-1;i>=0;i--))
do
  reverse="$reverse${input:$i:1}"
done

echo "$reverse"

mkdir $reverse



unzip $folder/$folder.zip -d $reverse

cp `pwd`/$reverse/$folder/*   `pwd`/$reverse


rm -rf $folder $reverse/$folder


for dir in $reverse/*; do
        echo $dir;
        done


