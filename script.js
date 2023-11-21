function Lyrics() {
    var lyricsContainer = document.getElementById('lyrics-container');
    lyricsContainer.innerHTML = ''; 
  
    for ( i = 99; i >= 2; i--)
     {
      var line = i+ " bottles of beer on the wall, "+i+ " bottles of beer.<br>"+
      "Take one down and pass it around, "+(i-1)+ " bottles of beer on the wall.<br> \n "
  
      lyricsContainer.innerHTML += line;
    }
  
    var lastLine = 
                    "1 bottle of beer on the wall, 1 bottle of beer.<br>"+
                    "Take one down and pass it around, no more bottles of beer on the wall.<br>\n"+
                    "No more bottles of beer on the wall, no more bottles of beer.<br>" +
                   "Go to the store and buy some more, 99 bottles of beer on the wall.<br>\n";
    lyricsContainer.innerHTML += lastLine;
  }
  
  


