<template>
  <div class="card">
    <h2 class="book-title">{{ books.title }}</h2>
    <img
      v-if="books.isbn"
      v-bind:src="
        'http://covers.openlibrary.org/b/isbn/' + books.isbn + '-M.jpg'
      "
    />
    <h3 class="book-author">{{ books.author }}</h3>
    <input
      class="mark-read"
      v-if="books.read"
      type="button"
      value="Mark Unread"
      v-on:click="mark(books.id)"
    />
    <input
      class="mark-unread"
      v-else
      type="button"
      value="Mark Read"
      v-on:click="mark(books.id)"
    />
  </div>
</template>

<script>
export default {
  name: "book-card",
  props: ["books"],
  methods: {
    mark(id) {
      this.$store.commit("FLIP_READ", id);
    },
  },
};
</script>

<style>
.card {
  border: 2px solid black;
  border-radius: 10px;
  width: 250px;
  height: 550px;
  margin: 20px;
}

.card.read {
  background-color: lightgray;
}

.card .book-title {
  font-size: 1.5rem;
}

.card .book-author {
  font-size: 1rem;
}
</style>