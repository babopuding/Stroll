// register the grid component
Vue.component('demo-grid', {
  template: '#grid-template',
  props: {
    data: Array,
    columns: Array,
    filterKey: String
  },
  data: function () {
    var sortOrders = {}
    this.columns.forEach(function (key) {
      sortOrders[key] = 1
    })
    return {
      sortKey: '',
      sortOrders: sortOrders
    }
  },
  computed: {
    filteredData: function () {
      var sortKey = this.sortKey
      var filterKey = this.filterKey && this.filterKey.toLowerCase()
      var order = this.sortOrders[sortKey] || 1
      var data = this.data
      if (filterKey) {
        data = data.filter(function (row) {
          return Object.keys(row).some(function (key) {
            return String(row[key]).toLowerCase().indexOf(filterKey) > -1
          })
        })
      }
      if (sortKey) {
        data = data.slice().sort(function (a, b) {
          a = a[sortKey]
          b = b[sortKey]
          return (a === b ? 0 : a > b ? 1 : -1) * order
        })
      }
      return data
    }
  },
  filters: {
    capitalize: function (str) {
      return str.charAt(0).toUpperCase() + str.slice(1)
    }
  },
  methods: {
    sortBy: function (key) {
      this.sortKey = key
      this.sortOrders[key] = this.sortOrders[key] * -1
    }
  }
})

// bootstrap the demo
var demo = new Vue({
  el: '#demo',
  data: {
	    searchQuery: '',
	    gridColumns: ['id', 'name', 'countryCode', 'district', 'population'],
	    gridData: [
// 	      { id: 1, name: 'Chuck Norris', power: Infinity },
// 	      { id: 2, name: 'Bruce Lee', power: 9000 },
// 	      { id: 3, name: 'Jackie Chan', power: 7000 },
// 	      { id: 4, name: 'Jet Li', power: 8000 }
	    ],
	    addData:{
	    	id: '',
	    	name: '',
	    	countryCode: '',
	    	district: '',
	    	population: ''
	    }
	  },
	  created: function(){
		  console.log("$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		  fetchData();
	  },
	  methods: {
		  addRow(){
			  console.log(this.addData.id);
			  if(this.addData.id != ''  && this.addData.quantity != '' && this.addData.name != '' ){
				  this.gridData.push(this.addData);
			  }
			  
			  this.addData = {};
			  
		  },
		  removeRow(index){
			  this.rows.splice(index,1);
		  }
	  }
	  
})

function fetchData(){
	console.log("fetchData~!~~~~~~~~~!!!!!");
	fetch('http://localhost:8080/getlist')
	.then((response) => {
		if(response.ok) {
			return response.json();
		}
	
		throw new Error('Network response was not ok');
	})
	.then(json => {
		//list.params = json
		demo.gridData = json;
// 		console.log('-----------' + demo);
	})
	.catch((error) => {
		console.log(error);
	});
}

