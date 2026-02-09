if [ $# -eq 1 ]
then
    if [ -f $1 ]
    then
        echo "reverse of $1"
        cat $1
        echo "-> "
        tac $1
    else
        echo "file not exist"
    fi
else
    echo "enter file name"
fi