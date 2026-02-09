read -p "enter a string: " str
read -p "enter starting index and no of characters: " a b
substr=${str:$a:$b}
echo "substring:$substr"