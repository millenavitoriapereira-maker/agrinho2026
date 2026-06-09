*{
    margin:0;
    padding:0;
    box-sizing:border-box;
    font-family: Arial, sans-serif;
}

body{
    background:#f4fff4;
    color:#333;
}

header{
    background:linear-gradient(to right,#2e7d32,#66bb6a);
    color:white;
    text-align:center;
    padding:40px 20px;
}

header h1{
    font-size:3rem;
}

.banner{
    text-align:center;
    padding:50px 20px;
}

.banner h2{
    color:#2e7d32;
    margin-bottom:15px;
}

.cards{
    display:flex;
    justify-content:center;
    flex-wrap:wrap;
    gap:20px;
    padding:30px;
}

.card{
    background:white;
    width:300px;
    padding:20px;
    border-radius:15px;
    box-shadow:0 4px 10px rgba(0,0,0,0.1);
    transition:0.3s;
}

.card:hover{
    transform:translateY(-8px);
}

.card h3{
    color:#2e7d32;
    margin-bottom:10px;
}

.interacao{
    text-align:center;
    padding:40px;
}

button{
    background:#2e7d32;
    color:white;
    border:none;
    padding:12px 25px;
    border-radius:8px;
    font-size:18px;
    cursor:pointer;
    transition:0.3s;
}

button:hover{
    background:#1b5e20;
}

#contador{
    margin-top:15px;
    font-size:20px;
    font-weight:bold;
}

footer{
    background:#2e7d32;
    color:white;
    text-align:center;
    padding:15px;
    margin-top:30px;
}