let person=[{
    fName:"gitika",
    lName: "pinjani",
    dept:"developer"
},
{
    fName:"katyani",
    lName: "sahu",
    dept:"hr"
},
{
    fName:"divya",
    lName: "sahu",
    dept:"hr"
},
{
    fName:"raj",
    lName: "sahu",
    dept:"hr"
}]

for(key of person)
{
    console.log(key);
}

console.log("==================================")

let AnotherPerson=person.sort((x,y)=>{
    return x.fName.localeCompare(y.fName)
   });

   for(const key of AnotherPerson){
       console.log(key);
   }

   let fill=person.filter