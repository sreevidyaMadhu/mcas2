read -p "enter directory name:" dir
for filename in "/mnt/c/shells2/$dir"
do
    if [ -d "$filename" ]
    then
        echo "$filename is a directory"
    else
        echo "$filename is not directory"
    fi
done
