#include "QuickSortObj.h"

void QuickSortObj::QuickSort(int list[], int size)
{
	QuickSort(list, 0, size - 1);
}

void QuickSortObj::QuickSort(int list[], int first, int last)
{
	if (last > first)
	{
		auto pivotIndex = Partition(list, first, last);
		QuickSort(list, first, pivotIndex - 1);
		QuickSort(list, pivotIndex + 1, last);
	}
}

int QuickSortObj::Partition(int list[], int first, int last)
{
	auto pivot = list[first];
	auto low = first - 1;
	auto high = last;

	while (high > low)
	{
		while ((low < high) && (list[low] <= pivot))
		{
			low ++;
		}

		while ((low <= high) && (list[high] > pivot))
		{
			high --;
		}

		if (high > low)
		{
			auto temp = list[high];
			list[high] = list[low];
			list[low] = temp;
		}
	}

	while ((high > first) && (list[high] >= pivot))
	{
		high --;
	}

	if (pivot > list[high])
	{
		list[first] = list[high];
		list[high] = pivot;
		return high;
	}

	return first;
}
