read -p "enter a file name: " file1
echo "enter the contents of $file1: "
cat > $file1
read -p "enter the existing file name:" file2
echo "displaying copy of contents from $file1 to $file2"
cp $file1 $file2
cat $file2