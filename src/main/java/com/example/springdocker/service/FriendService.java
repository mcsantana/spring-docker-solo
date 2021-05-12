package com.example.springdocker.service;
import com.example.springdocker.model.Friend;
import com.example.springdocker.repository.FriendRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class FriendService {
    private final FriendRepository repository;

    public List<Friend> getFriends() {
        return repository.findAll();
    }

    public void saveNewFriend(Friend friend) {
        repository.save(friend);
    }

    public List<String> getLikeableFriends() {
        // hämtar alla kompisar som vi är likeable
        List<Friend> likeableFriends = repository.findFriendByCanPlay(true);

        // returnerar endast kompisnamnen i en lista
        return likeableFriends.stream()
                .map(friend -> friend.getName())
                .collect(Collectors.toList());
    }
}
