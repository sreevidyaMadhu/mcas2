while true
do
        read -p "enter two numbers:" a b
        read -p "enter the operator:" op
        case $op in
                "+")
                        ans=$(echo "$a + $b" | bc);;
                "-")
                        ans=$(echo "$a - $b" | bc);;
                "*")
                        ans=$(echo "$a * $b" | bc);;
                "/")
                        ans=$(echo "$a / $b" | bc);;
                *)
                        exit 1;;
        esac
        echo "$a $op $b = $ans"
done