read -p "enter a file name: " file1
echo "enter contents of $file1: "
cat > $file1
read -p "enter line number: " l
echo "Start printing from line $l"
tail +$l $file1