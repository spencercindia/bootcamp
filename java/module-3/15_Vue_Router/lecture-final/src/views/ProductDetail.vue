<template>
  <div id="app" class="main">
    <h1>{{product.name}}</h1>
    <p class ="description">{{product.description}}</p>
    <div class="actions">
      <router-link v-bind:to="{name:'products'}">Back to products</router-link>
      <router-link v-bind:to="{name: 'add-review', params: {id: product.id}}"> Add a review</router-link>
    </div>
    <div class="well-display">
      <average-summary/>
      <star-summary rating="1"/>
      <star-summary rating="2"/>
      <star-summary rating="3"/>
      <star-summary rating="4"/>
      <star-summary rating="5"/>
    </div>
    <review-list/>
  </div>
</template>

<script>
import AverageSummary from "../components/AverageSummary";
import StarSummary from "../components/StarSummary";
import ReviewList from "../components/ReviewList";

export default {
  components: {
    ReviewList,
    StarSummary,
    AverageSummary
  },
  computed: {
    product(){
      return this.$store.state.products.find(p => {
        return p.id == this.$store.state.activeProduct
      })
    }
  },
  created(){
    const activeProductID = this.$route.params.id
    this.$store.commit("SET_ACTIVE_PRODUCT", activeProductID)
  }
}
</script>

<style scoped>

</style>
