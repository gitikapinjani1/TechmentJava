// var emp = ["sam","vimal", "ratan"]
// for(i=0;i<emp.length;i++)
// {
//     console.log(emp[i]);
// }


// var i;
// var emp = new Array();
// emp[0]="Arun";
// emp[1]="Varun";
// emp[2]="john";


// for(i=0;i<emp.length;i++)
// {
//     console.log(emp[i]);
// }


// var emp=new Array("jai", "Vijay", " Smith");
// for(i=0;i<emp.length;i++)
// {
//     console.log(emp[i]);
// }


let person=[{
    fName:"gitika",
    lName: "pinjani",
    dept:"developer"
},
{
    fName:"katyani",
    lName: "sahu",
    dept:"hr"
}]

for(key of person)
{
    console.log(key);
}

person.push({
    fName:"divya",
    lName: "sahu",
    dept:"hr"
})

console.log("------------------------------------")
for(key of person)
{
    console.log(key);
}


person.push({
    fName:"raj",
    lName: "sahu",
    dept:"hr"
})


let arr3=[5,8,6,3,8,1,9];

console.log(arr3.sort());

let arr5=person.filter((key)=>{
    return key.dept=="hr";
})

console.log(arr5);

