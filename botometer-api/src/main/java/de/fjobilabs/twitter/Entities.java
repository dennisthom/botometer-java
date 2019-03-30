package de.fjobilabs.twitter;

import java.util.List;

/**
 * @since 0.1.0
 * @author Felix Jordan
 */
public interface Entities {
    
    List<? extends HashtagEntity> getHashtags();
    
    List<? extends MediaEntity> getMedia();
    
    List<? extends URLEntity> getUrls();
    
    List<? extends UserMentionEntity> getUserMentions();
    
    List<? extends SymbolEntity> getSymbols();
    
    List<? extends PollEntity> getPolls();
}
