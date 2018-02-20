public class HiddenWord
{
  private String hidden;
  
  public HiddenWord(String hidden)
  {
    this.hidden = hidden;
  }
  
  public String getHint(String guess)
  {
    String hint = "";
    for(int i = 0; i < hidden.length(); i++)
    {
      String c = guess.substring(i,i+1);
      if(c.compareTo(hidden.substring(i,i+1))==0)
        hint += c;
      else if (hidden.indexOf(c) > 0)
        hint += "+";
      else
        hint += "*";
    }
    return hint;
  }
  
  
}