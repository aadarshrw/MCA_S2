for filename in NW/*
do
    echo $filename | grep -q " "
    if [[ $? -eq 0 ]]
    then
        newname=$(echo $filename | sed -e "s/ /_/g")
        echo $newname
        mv "$filename" "$newname"
    fi
done
