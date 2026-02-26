read -p "enter the first file name:" file1
read -p "enter the second file name:" file2
read -p "enter the third file name:" file3
echo "enter the contents of $file1: "
cat > $file1
echo "enter contents of $file2:"
cat > $file2
echo "differenco of $file1 and $file2 saved in $fie3:"
diff -a $file1 $file2 > $file3
cat $file3