package word;

public final class Word implements Comparable<Word>
{
    String word, wordType, language;
    int length;
    
    public Word(String word)
    {
	this.word = word;
	this.length = word.length();
    }

    @Override
    public String toString()
    {
	return "Word [word=" + word + ", wordType=" + wordType + ", language=" + language + ", length=" + length + "]";
    }

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public String getWordType()
    {
        return wordType;
    }

    public void setWordType(String wordType)
    {
        this.wordType = wordType;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    @Override
    public int compareTo(Word o)
    {
	return this.word.compareTo(o.word);
    }
}
