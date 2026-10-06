int minAddToMakeValid(char* s) {
    int i=0;
    int open=0;
    int addition=0;
    for(i=0;i<strlen(s);i++){
      if(s[i]=='('){
        open++;
      }else{
        if(open>0){
            open--;
        }else{
             addition++;
        }
      }
    }
    return open+addition;
}
