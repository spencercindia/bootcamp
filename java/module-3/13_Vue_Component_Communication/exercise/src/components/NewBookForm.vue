<template>
  <div>
    <form class="new-book-form">
      <h1>Add a new book!</h1>
      <p>Title:</p>
      <input class="title-input" type="text" v-model="newBook.title" />
      <p>Author:</p>
      <input class="author-input" type="text" v-model="newBook.author" />
      <p>ISBN:</p>
      <input class="isbn-input" type="text" v-model="newBook.isbn" />
      <input type="submit" value="Submit" v-on:click="addNew(newBook)" />
    </form>
  </div>
</template>

<script>
export default {
  name: "new-book-form",
  newBook: {
    title: "",
    author: "",
    read: false,
    isbn: "",
  },
  methods: {
    addNew(book) {
      this.$store.commit("ADD_NEW", book);
    },
  },
};
</script>
<style>
/* .new-book-form {
}
.title-input {
}
.author-input {
}
.isbn-input {
} */
</style>